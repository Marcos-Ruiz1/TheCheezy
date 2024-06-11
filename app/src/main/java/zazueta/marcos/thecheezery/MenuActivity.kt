package zazueta.marcos.thecheezery

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_menu)

        val btnCold: Button = findViewById(R.id.button_cold_drinks)
        val btnHot: Button = findViewById(R.id.button_hot_drinks)
        val btnSweet: Button = findViewById(R.id.button_sweets)
        val btnSalties: Button = findViewById(R.id.button_salties)

        btnCold.setOnClickListener {
            val intent: Intent = Intent(this, ProductosActivity::class.java)
            startActivity(intent)
        }
        btnHot.setOnClickListener {
            val intent: Intent = Intent(this, HotDrinksActivity::class.java)
            startActivity(intent)
        }
        btnSweet.setOnClickListener {
            val intent: Intent = Intent(this, SweetsActivity::class.java)
            startActivity(intent)
        }
        btnSalties.setOnClickListener {
            val intent: Intent = Intent(this, SaltiesActivity::class.java)
            startActivity(intent)
        }
    }
}