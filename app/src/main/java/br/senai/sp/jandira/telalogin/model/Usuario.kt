package br.senai.sp.jandira.telalogin.model

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "tbl_usuarios")
data class Usuario(

    @PrimaryKey(autoGenerate = true)
    var id: Long = 0,


    var usuario: String = "",
    var telefone: String = "",
    var email: String = "",
    var senha: String = "",

    )
