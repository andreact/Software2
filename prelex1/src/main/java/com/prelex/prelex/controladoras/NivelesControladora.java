package com.prelex.prelex.controladoras;

import com.prelex.prelex.entidades.Niveles;
import com.prelex.prelex.servicios.NivelesServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.LinkedList;

/**Controladdora de los niveles
 * encargada de manejar los metodos del CRUD.
 * @author Sebas
 * @version  1.0
 */
@Controller
public class NivelesControladora {
    @Autowired
    private NivelesServicio nivelesServicio;

    /**
     *
     * @param model modelo donde se contiene los atributos.
     * @return List que se usara para mostrar todos los niveles que hay.
     */
    @RequestMapping(value = "/niveles", method = RequestMethod.GET)
    public String listarNiveles(Model model)
    {
        LinkedList<Niveles> niveles = nivelesServicio.listaNiveles();
        for (Niveles lvl:
                niveles) {
            System.out.println(lvl.getCodigo());
        }

        model.addAttribute("niveles", niveles);
        return "niveles";
    }

    /** metodo encargado de mostrar la lista
     * de niveles
     * @param codigo codigo unico con que se identifica un nivel
     * @param model objeto donde se encuentra las variables
     * @return un objecto nivel que es donde se encuentra el nivel que se
     * esta buscando
     */
    @RequestMapping("niveles/{codigo}")
    public String mostrarNivel(@PathVariable String codigo, Model model)
    {
        LinkedList<Niveles> niveles = new LinkedList<>();
        Niveles nivel = nivelesServicio.obtenerNivel(codigo);

        if (nivel !=null)
        {
            niveles.add(nivel);
        }
        model.addAttribute("niveles", niveles);

        return "niveles";
    }

    /** metodo encargado de editar un
     *  nivel.
     * @param codigo codigo del nivel que se va a editar
     * @param model modelo donde se optienen los parametros.
     * @return
     */
    @RequestMapping("niveles/editar/{codigo}")
    public String editarNivel(@PathVariable String codigo, Model model)
    {
        model.addAttribute("niveles", nivelesServicio.obtenerNivel(codigo));
        return "formularioNiveles";
    }

    /** metodo encargado de agregar un nuevo
     *  nivel
     * @param model modelo donde trabajara
     * @return
     */
    @RequestMapping("niveles/nuevo")
    public String nuevoNivel(Model model)
    {
        model.addAttribute("niveles", new Niveles());
        return "formularioNiveles";
    }

    /** Metodo encargado de guardar
     *  un nivel.
     * @param n obtiene el objecto
     * y lo guarda en el repositorio.
     * @return
     */
    @RequestMapping(value = "/niveles", method = RequestMethod.POST)
    public String guardarNivel(Niveles n)
    {
        nivelesServicio.guardarNivel(n);
        return "redirect:/niveles/"+ n.getCodigo();
    }

    /** metodo encargado de elminar un nivel
     *  por su codigo
     * @param codigo codigo con el cual se busca el nivel
     * @return
     */
    @RequestMapping("niveles/eliminar/{codigo}")
    public String eliminar(@PathVariable String codigo)
    {
        nivelesServicio.eliminarNivel(codigo);
        return "redirect:/niveles";
    }


}
