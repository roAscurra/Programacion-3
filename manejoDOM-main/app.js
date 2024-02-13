// //Acceder a todo el elemento html
// console.log(document)
// //selector por id
// console.log(document.getElementById("header"))
// //selector por clase
// console.log(document.getElementsByClassName("container-fluid"))
// //selector por nombre de etiqueta
// console.log(document.getElementsByTagName("div"))
// //selector por nombre
// console.log(document.getElementsByName("seccion"))
// //selector querySelector y querySelectorAll
//     //tagName
//     console.log(document.querySelector("div"))
//     console.log(document.querySelectorAll("div"))
//     //clase
//     console.log(document.querySelector(".container-fluid"))
//     console.log(document.querySelectorAll(".container-fluid"))
//     //id
//     console.log(document.querySelector("#header"))
//     console.log(document.querySelectorAll("#header"))

// const elemento = document.getElementById("header");
// //seleccionar hijo:
// console.log(elemento.children)
// //seleccionar padre:
// console.log(elemento.parentElement)

// const list1 = document.getElementsByClassName("container-fluid")
// console.log(list1)
// const list2 = document.querySelectorAll(".container-fluid")
// console.log(list2)

//CREACION DE ELEMENTOS
const title1 = document.createElement('h2')
const title2 = document.createTextNode("Titulo creado con createTextNode")
const comentario = document.createComment("Comentario x")
//elemento hijo a crear
const articulo = document.querySelector("article")
//clono el nodo de articulo
const articulo2 = articulo.cloneNode(true)
//agregar un elemento hijo al elemento padre(#seccion)
const seccion = document.getElementById("seccion")
seccion.appendChild(articulo2)
//insertAdjacentElement
seccion.insertAdjacentElement('beforeend',articulo2)
//insertar texto
seccion.insertAdjacentText('beforeend', 'Acá acaba la seccion')
//insertar texto en formato html sin necesidad de crearlo antes
seccion.insertAdjacentHTML('beforeend','<h3>Titulo inventado, insertado con insertAdjacentHTML</h3>')

//eliminar elementos, pero no en memoria
// seccion.remove();
//reemplazar contenido
// seccion.innerHTML = '<h2>Nuevo titulo de la seccio</h2>'
//reemplazar todo el contenido html
// seccion.outerHTML = '<h2>Reemplazo contenido</h2>'
//Seleccion de hijos
// seccion.children[1].textContent = 'otro titulo'
//Modificar propiedades de un elemento en el DOM
//traer un atributo
// console.log(seccion.getAttribute('id'))
// //traer las clases que tiene un elemento
// console.log(seccion.classList)
// //traer el nombre de la clase
// console.log(seccion.className)
// //añadir clase
// seccion.classList.add('nuevaClase')
// //eliminar clase
// seccion.classList.remove('nuevaClase')
// //si tiene la clase, la quita. Si no tiene la clase, la agrega
// seccion.classList.toggle('nuevaClase')

//EVENTOS
// function clickTitulo(){
//     console.log("El usuario hizo click en el titulo")
// }
// const titulo = document.getElementById('tituloForm')
// // titulo.onclick = clickTitulo
// titulo.addEventListener("click", clickTitulo)
// //remover evento
// titulo.removeEventListener("click", clickTitulo)
//EVENTO DOMContentLoaded
// document.addEventListener("DOMContentLoaded", ()=>{
//     console.log("El documento se ha cargado")
// })
//EVENTO SUBMIT
const form = document.querySelector("#formulario")
const enviarFormulario = (evento) =>{
    event.preventDefault()
    console.log(evento)
    //acceder a los valores de los inputs
    // console.log(evento.target.nombre.value, evento.target.email.value, evento.target.contraseña.value)
    const {nombre, email, contraseña} = evento.target
    console.log(nombre.value, email.value, contraseña.value)
    if(nombre.value.length == 0){
        alert("El nombre no es valido")
    }
}

form.addEventListener("submit", enviarFormulario)
//EVENTO BUBBLING
const section = document.getElementById("seccion")
const titulo2 = document.getElementById("tituloSeccion")

titulo2.addEventListener("click", (event)=>{
    // console.log(event.bubbles, event.cancelBubble)
    // event.stopPropagation()
    // console.log(event.bubbles, event.cancelBubble)
    console.log("Click en el titulo")
})
section.addEventListener("click", (event)=>{
    console.log("Click en el seccion")
},{
    capture : true
})
//Delegacion de eventos
// section.addEventListener("click", (event)=>{
//     console.log(event.target, event.currentTarget)
// })
//eventos en capture
