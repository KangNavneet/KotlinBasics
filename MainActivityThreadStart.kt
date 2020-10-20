package com.navneetkang.simplepokemonapp

import android.os.AsyncTask
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainButton.setOnClickListener {
            mainButton.isEnabled = false
            resultText.text = "You got the result"

        }

    }

    inner class LongRunningTask: AsyncTask<Unit, Unit, Unit>()
    {
        override fun doInBackground(vararg params: Unit?) {
            Thread.sleep(300)
        }

        override fun onPreExecute() {
            super.onPreExecute()
        }

        override fun onPostExecute(result: Unit?) {
            super.onPostExecute(result)
            resultText.text="Good Morning"
        }

        override fun onProgressUpdate(vararg values: Unit?) {
            super.onProgressUpdate(*values)
        }

        override fun onCancelled(result: Unit?) {
            super.onCancelled(result)
        }

        override fun onCancelled() {
            super.onCancelled()
        }

    }

    inner class exampleThread(seconds:Long) : Thread()
    {

        var seconds= seconds
        override fun run() {

            for (x in 0..10)
            {

                Log.d("Navneet", "startThread:$x ")
                Thread.sleep(seconds)

            }

        }
    }

    fun stopThread(view: View) {

    }

    fun startThread(view: View) {
        var thread =exampleThread(1000);
        thread.start()


    }




}