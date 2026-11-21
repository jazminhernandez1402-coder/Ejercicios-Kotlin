open class Notificacion {
    open fun enviar() {
        println("Enviando notificacion generica...")
    }
}

class NotificacionCorreo : Notificacion() {
    override fun enviar() {
        println("Enviando notificacion por correo electronico.")
    }
}

class NotificacionSMS : Notificacion() {
    override fun enviar() {
        println("Enviando notificacion por mensaje SMS.")
    }
}

class NotificacionPush : Notificacion() {
    override fun enviar() {
        println("Enviando notificacion push a la aplicacion.")
    }
}

fun main() {
    val correo = NotificacionCorreo()
    val sms = NotificacionSMS()
    val push = NotificacionPush()

    correo.enviar()
    sms.enviar()
    push.enviar()

    println("\nPolimorfismo con una lista:")
    val notificaciones: List<Notificacion> = listOf(correo, sms, push)
    for (notificacion in notificaciones) {
        notificacion.enviar()
    }
}