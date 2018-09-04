package eu.artouch.tictactoe

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import eu.artouch.tictactoe.data.TicTacToeModel
import eu.artouch.tictactoe.view.TicTacToeView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ticTacToeView = findViewById(R.id.ticTacToeView) as TicTacToeView

        (findViewById(R.id.btnRestart) as Button).setOnClickListener {
            ticTacToeView.resetGame()
        }


    }

    private fun TicTacToeView.resetGame() {
        TicTacToeModel.resetModel()
        invalidate()
    }
}