package id.ac.polbeng.amandaagungpermata.p8pro20

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnlistview.setOnClickListener{
            actionPindah(ListviewActivity())
        }
    }

    private fun actionPindah(simpleActivity: Any) {
        startActivity(Intent(applicationContext,simpleActivity::class.java))
    }

}