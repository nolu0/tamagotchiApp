package com.myapplicationthando.tamagotchiapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

private val Any.lettamagotchiSleep: Unit
    get() {
        TODO("Not yet implemented")
    }

class MainActivity2 : AppCompatActivity() {

    private lateinit var tamagotchi: tamagotchi
    private lateinit var  tamagotchiImageView: ImageView
    private lateinit var  tamagotchiStatusTextViewTextView: TextView

    @android.annotation.SuppressLint("MissingInflatedId")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        tamagotchi = tamagotchi("Tamagotchi")
        tamagotchiStatusTextViewTextView = findViewById(R.id.tamagotchiStatusTextView)
        tamagotchiImageView = findViewById(R.id.tamagotchiImageView)

        findViewById<Button>(R.id.feedbutton).setOnClickListener { feedtama() }
        findViewById<Button>(R.id.bathbutton).setOnClickListener { bathtama() }
        findViewById<Button>(R.id.playbutton).setOnClickListener { lettamaplay() }
        findViewById<Button>(R.id.sleepbutton).setOnClickListener {
            lettamagotchiSleep

        }
        findViewById<Button>(R.id.statusbutton).setOnClickListener { displaytamastatus() }

    }
    private fun findViewById(): Any {

        return TODO("Provide the return value")
    }


    private fun feedtama() {
        var tamagotchiActions = null
        tamagotchiActions.feedtama(tamagotchi)
        updateStatusAndImage()
    }
    private fun bathtama() {
        var tamagotchiActions = null
        tamagotchiActions.bathtama(tamagotchi)
        updateStatusAndImage()

    }
    private fun lettamaplay() {
        var tamagotchiActions = null
        tamagotchiActions.lettamaplay(tamagotchi)
        updateStatusAndImage()
    }
    private fun lettamagotchiSleep(tamagotchiActions: Any) {
        tamagotchiActions.lettamagotchiSleep
        updateStatusAndImage()
    }
    private  fun displaytamastatus() {
        updateStatusAndImage()

    }
    private  fun  updateStatusAndImage() {
        tamagotchiStatusTextViewTextView.text = tamagotchi.getsStaus().toString()
        var tamagotchiActions = null
        tamagotchiImageView.setImageResource(tamagotchiActions.getTamagotchiImage(tamagotchi))
    }
    private var hunger = 0
    private var bath = 0
    private var happiness = 0
    private var energy = 100

    fun feed() {
        hunger += 10
        if (hunger < 0) hunger = 0
    }
    fun bath() {
        bath += 10
        if (bath < 0) bath = 0


    }
    fun play() {
        happiness +=10
        hunger +=10
        bath +=10
        energy +=10

        if (happiness > 100) happiness = 100
        if (energy < 0) energy = 0
    }
    fun sleep() {
        hunger += 3
        energy += 20
        if (energy > 100) energy = 100
    }
    fun getsStaus(): String {
        run {
            string {
            }
        }

        return TODO("Provide the return value")
    }
}


private fun ImageView.setImageResource(tamagotchiImage: Unit) {
    TODO("Not yet implemented")
}

private fun Nothing?.lettamaplay(tamagotchi: Any) {
    TODO("Not yet implemented")
}

private fun Nothing?.bathtama(tamagotchi: Any) {
    TODO("Not yet implemented")
}

private fun Nothing?.getTamagotchiImage(tamagotchi: Any) {

}

private fun Nothing?.feedtama(tamagotchi: Any) {

}


private fun <tamagotchi> tamagotchi.getsStaus() {

}

private fun string(function: () -> Unit) {

}
