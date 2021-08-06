package com.example.appcartaodevisitas.ui

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import com.example.appcartaodevisitas.databinding.ActivityAddBusinessCardBinding
import com.example.appcartaodevisitas.text

class AddBusinessCardActivity : AppCompatActivity() {

    private val bindingAdd by lazy { ActivityAddBusinessCardBinding.inflate(layoutInflater) }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(bindingAdd.root)

        cancelListener()
    }

    fun addCardListener(){
        bindingAdd.fabConfirm.setOnClickListener {  }
    }

    fun cancelListener(){
        bindingAdd.fabCancel.setOnClickListener {
            var notEmpty = emptyInputVerification()
            if (notEmpty == true){
                //criar alerta confirmando se ele quer descartar as alterações
                val builder = AlertDialog.Builder(this)
                builder.setTitle("Atenção")
                builder.setMessage("Deseja descartar as alterações feitas?")
                builder.setPositiveButton("Descartar",{ dialogInterface: DialogInterface, i: Int ->
                    //acao do botao positivo
                    finish()
                })
                builder.setNegativeButton("Cancelar",{ dialogInterface: DialogInterface, i: Int ->
                })
                builder.show()
            }
            else finish()

        }
    }

    fun emptyInputVerification() : Boolean{
        var emptyStatus: Boolean = false
        val contentEmpresa = bindingAdd.tilEmpresa.text
        val contentNome = bindingAdd.tilNome?.text
        val contentTel = bindingAdd.tilTelefone?.text
        val contentEmail = bindingAdd.tilTelefone?.text

        if (contentEmpresa.isNullOrBlank() && contentEmpresa.isNullOrEmpty()
            && contentNome.isNullOrBlank() && contentNome.isNullOrEmpty()
            && contentTel.isNullOrBlank()  && contentTel.isNullOrEmpty()
            && contentEmail.isNullOrBlank() && contentEmail.isNullOrEmpty())
        else emptyStatus = true
        return emptyStatus

    }
}