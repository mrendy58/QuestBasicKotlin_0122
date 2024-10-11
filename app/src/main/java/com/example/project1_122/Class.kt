package com.example.project1_122

class Motor()

class Contact(val id: Int, var email:String)

fun main() {
    val contact = Contact(1, "muhamad@gmail.com")

// Prints the value of the property: email
    println(contact.email)


// Updates the value of the property: email
    contact.email = "rendy@gmail.com"

// Prints the new value of the property: email
    println(contact.email)

}