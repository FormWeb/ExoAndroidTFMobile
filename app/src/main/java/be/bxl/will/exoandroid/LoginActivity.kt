package be.bxl.will.exoandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.EditText
import be.bxl.will.exoandroid.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    companion object {
        val TAG = LoginActivity::class.java.simpleName
    }

    private lateinit var binding : ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnLoginLogin.setOnClickListener {
            Log.d(TAG, binding.etUsernameLogin.text.toString())
            Log.d(TAG, binding.etPasswordLogin.text.toString())
        }

        binding.btnResetLogin.setOnClickListener {
            binding.etUsernameLogin.setText("")
            binding.etPasswordLogin.setText("")
        }
    }
}