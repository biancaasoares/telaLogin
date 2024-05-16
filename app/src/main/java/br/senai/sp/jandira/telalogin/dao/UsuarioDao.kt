package br.senai.sp.jandira.telalogin.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import br.senai.sp.jandira.telalogin.model.Usuario

@Dao
interface UsuarioDao {

    @Insert
    fun salvar(usuario: Usuario): Long

    @Query("SELECT * FROM tbl_usuarios ORDER BY usuario ASC")
    fun listarTodosOsUsuarios(): List<Usuario>
}