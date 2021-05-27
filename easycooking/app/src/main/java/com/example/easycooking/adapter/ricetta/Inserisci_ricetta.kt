package com.example.easycooking.adapter.ricetta

import android.app.Activity
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.text.Editable
import android.text.TextUtils
import android.text.TextWatcher
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import com.example.easycooking.R


var fotoscelta:String=""
private lateinit var editorNomeView: EditText
private lateinit var photoview:ImageButton
private lateinit var editorProcedimento:EditText
private lateinit var editorPrepTime:EditText
private lateinit var editorCookTime:EditText
class Inserisci_ricetta : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scriviricetta)

        editorNomeView=findViewById(R.id.nome_ricetta_inserimento)
        photoview=findViewById(R.id.imageButton3)
        editorProcedimento=findViewById(R.id.editTextTextMultiLine)
        editorPrepTime=findViewById(R.id.prep_inserimento)
        editorCookTime=findViewById(R.id.cott_inserimento)
        var n=1

        editorPrepTime.addTextChangedListener(object : TextWatcher {
            var len = 0
            override fun afterTextChanged(s: Editable) {
                val str: String = editorPrepTime.text.toString()
                if (str.length == 2 && len < str.length) { //len check for backspace
                    editorPrepTime.append(":")
                }
                if (str.length == 5 && len < str.length) { //len check for backspace
                    editorPrepTime.append(":")
                }

            }

            override fun beforeTextChanged(arg0: CharSequence, arg1: Int, arg2: Int, arg3: Int) {
                val str: String = editorPrepTime.text.toString()
                len = str.length
            }

            override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {}
        })
        editorCookTime.addTextChangedListener(object : TextWatcher {
            var len = 0
            override fun afterTextChanged(s: Editable) {
                val str: String = editorCookTime.text.toString()
                if (str.length == 2 && len < str.length) { //len check for backspace
                    editorCookTime.append(":")
                }
                if (str.length == 5 && len < str.length) { //len check for backspace
                    editorCookTime.append(":")
                }

            }

            override fun beforeTextChanged(arg0: CharSequence, arg1: Int, arg2: Int, arg3: Int) {
                val str: String = editorCookTime.text.toString()
                len = str.length
            }

            override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {}
        })


        photoview.setOnClickListener {
        val intent = Intent()
        intent.type = "image/*"
        intent.action = Intent.ACTION_GET_CONTENT
        startActivityForResult(Intent.createChooser(intent, "select a picture"), YOUR_IMAGE_CODE)

        }

        var add = findViewById<Button>(R.id.addingr)
            add.setOnClickListener { view ->
                val editText = EditText(this)
                n=n+1
                editText.id=n
                val lay=findViewById<LinearLayout>(R.id.edit_texts_container).addView(editText)
            }


        val bt: Button =findViewById<Button>(R.id.salvaRicetta)
        bt.setOnClickListener {
            val replyIntent = Intent()
            if (TextUtils.isEmpty(editorNomeView.text)) {
                setResult(Activity.RESULT_CANCELED, replyIntent)
            } else {
                val nomeric= editorNomeView.text.toString()
                replyIntent.putExtra(EXTRAs_REPLY, nomeric)
                replyIntent.putExtra("photo", fotoscelta)
                replyIntent.putExtra("procedimento", editorProcedimento.text.toString())
                replyIntent.putExtra("tempo_prep", editorPrepTime.text.toString())
                replyIntent.putExtra("tempo_cott", editorCookTime.text.toString())
                //replyIntent.putExtra("tempo_tot")
                setResult(Activity.RESULT_OK, replyIntent)
            }
            finish()
        }
    }
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == YOUR_IMAGE_CODE) {
            if(resultCode == RESULT_OK) {
                var selectedImageUri: Uri? = data?.data
                fotoscelta=selectedImageUri.toString()
                photoview.setImageResource(R.drawable.thumbs_up)
            }
        }
    }

    companion object {
        const val EXTRAs_REPLY = "com.example.android.ricettalistsql.REPLY"
        const val YOUR_IMAGE_CODE = 192
    }
}