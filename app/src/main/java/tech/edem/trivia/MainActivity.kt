package tech.edem.trivia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import tech.edem.trivia.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        @Suppress("UNUSED_VARIABLE")
        val binding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
    }
}