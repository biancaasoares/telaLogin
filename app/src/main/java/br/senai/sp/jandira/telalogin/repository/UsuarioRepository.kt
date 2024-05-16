package br.senai.sp.jandira.telalogin.repository

import android.content.Context
import br.senai.sp.jandira.telalogin.dao.UsuarioDb
import br.senai.sp.jandira.telalogin.model.Usuario

class UsuarioRepository (context: Context) {

    private val db = UsuarioDb.getBancoDeDados(context).usuarioDao()

    fun salvar (usuario: Usuario): Long {
        return db.salvar(usuario)
    }

    fun listarTodosOsUsuarios(): List<Usuario>{
        return db.listarTodosOsUsuarios()
    }
}