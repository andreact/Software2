package com.prelex.prelex.controladoras;

import com.prelex.prelex.entidades.Preinscripciones;
import com.prelex.prelex.servicios.PreinscripcionServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.LinkedList;

/** Clase que funciona como controladora para la interaccion con la base de datos
 * @author andrea
 * @version 1.0
 */
@Controller
public class PreinscripcionControladora {
    @Autowired
    private PreinscripcionServicio preinscripcionServicio;

    /**Lista todas las preinscripciones presentes en la base de datos a traves de una
     * peticion GET; esta lista es desplegada en la ruta '/preinscripciones'
     * @param model es el modelo que posteriormente se va a renderizar
     * con thymeleaf
     * @return el nombre de la pagina donde se mostrara la lista de preinscripciones
     */
    @RequestMapping(value = "/preinscripciones", method = RequestMethod.GET)
    public String lista(Model model) {
        LinkedList<Preinscripciones> preinscripciones = preinscripcionServicio.listaPreinscripciones();
        for (Preinscripciones preins:
             preinscripciones) {
            System.out.println(preins.getNumeroDocumento());
        }

        model.addAttribute("preinscripciones", preinscripciones);
        return "preinscripciones";
    }

    /**Dado un id en la ruta 'preinscripcion/{id}', muestra toda la informacion
     * de la preinscripcion correspondiente
     * @param model es el modelo que posteriormente se va a renderizar
     * con thymeleaf
     * @param id es el id de la preinscripcion que se desea visualizar
     * @return el nombre de la pagina donde se mostraran los datos
     */
    @RequestMapping("preinscripcion/{id}")
    public String mostrarPreinscripcion(@PathVariable String id, Model model) {
        LinkedList<Preinscripciones> preinscripciones = new LinkedList<>();
        Preinscripciones preinscripcion = preinscripcionServicio.obtenerPreinscripcion(id);

        if (preinscripcion !=null) {
            preinscripciones.add(preinscripcion);
        }
        model.addAttribute("preinscripciones", preinscripciones);

        return "preinscripciones";
    }

    /**Dado un id en la ruta 'preinscripcion/editar/{id}', muestra toda la informacion
     * de la preinscripcion correspondiente, pero con la opcion de poder modificar campos de
     * la misma y guardarlos
     * @param model es el modelo que posteriormente se va a renderizar
     * con thymeleaf
     * @param id es el id de la preinscripcion que se desea editar
     * @return el nombre de la pagina donde se podra realizar la edicion
     */
    @RequestMapping("preinscripcion/editar/{id}")
    public String editar(@PathVariable String id, Model model) {
        model.addAttribute("preinscripcion", preinscripcionServicio.obtenerPreinscripcion(id));
        return "formularioPreinscripcion";
    }

    /**Permite adicionar una nueva preinscripcion ingresando la ruta: 'preinscripcion/nuevo'
     * @param model es el modelo que posteriormente se va a renderizar
     * con thymeleaf
     * @return el nombre de la pagina donde se podra realizar la adicion
     */
    @RequestMapping("preinscripcion/nuevo")
    public String nuevaPreinscripcion(Model model) {
        return "formularioPreinscripcion";
    }

    /**Recibe una preinscripcion a traves de una peticion POST por la ruta
     * '/preinscripcion; y adiciona la preinscripcion en la base de datos
     * @param p preinscripcion que se recibe por la peticion POST
     * @return el nombre de la pagina donde se redireccionara
     */
    @PostMapping("/preinscripcion")
    // Con @valid nos aseguramos que el contenido de la peticion sea valido
    public String guardarPreinscripcion(@Valid @RequestBody Preinscripciones p) {
        preinscripcionServicio.guardarPreinscripcion(p);
        return "redirect:/preinscripcion/"+ p.getNumeroDocumento();
    }

    /**Permite eliminar una nueva preinscripcion dado un id,ingresando a la ruta: 'preinscripcion/eliminar/{id}'
     * @param id corresponde al id de la preinscripcion que se desea eliminar
     * @return el nombre de la pagina donde se redireccionara al usuario despues de la eliminacion
     */
    @RequestMapping("preinscripcion/eliminar/{id}")
    public String eliminar(@PathVariable String id) {
        preinscripcionServicio.eliminarPreinscripcion(id);
        return "redirect:/preinscripciones";
    }



}
