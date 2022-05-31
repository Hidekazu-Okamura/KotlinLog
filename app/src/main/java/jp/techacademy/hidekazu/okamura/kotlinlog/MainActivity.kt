package jp.techacademy.hidekazu.okamura.kotlinlog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log   // ここを追加

const val MY_TAG="kotlintest"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Log.d(MY_TAG, "ログへの出力テスト")
        /*var num=10
        Log.d("kotlintest", Integer.toString(num))
        num=50
        Log.d("kotlintest", num.toString())
        val num1 = 10 + 5 - 2 * 4 / 2
        Log.d("kotlintest", "10 + 5 - 2 * 4 / 2 = " + num1)

        val flag1 = true
        val flag2 = false
        Log.d("kotlintest", "flag1 && flag2 = " + (flag1 && flag2))
        Log.d("kotlintest", "flag1 || flag2 = " + (flag1 || flag2))

        val num2 = 10
        val num3 = 20
        Log.d("kotlintest", "num2 < num3 = " + (num2 < num3)) */
        /* var num = 60

        if (num >= 90) {
            Log.d("kotlintest", "優")
        } else if (num >= 75) {
            Log.d("kotlintest", "良")
        } else if (num >= 60) {
            Log.d("kotlintest", "可")
        } else {
            Log.d("kotlintest", "不可")
        } */
        /*val drink=2
        when (drink) {
            0 -> {
                Log.d("kotlintest", "コーヒーを注文しました")
            }
            1 -> Log.d("kotlintest", "紅茶を注文しました")
            2 -> Log.d("kotlintest", "ミルクを注文しました")
            else -> Log.d("kotlintest", "オーダーミスです")
        }*/

            /*val dog = Dog("ポチ", 3)      // 名前をポチ、年齢3歳で、Dogのインスタンスを作る

            dog.say()
            Log.d(MY_TAG, "犬の名前は" + dog.name + "です。")
            Log.d(MY_TAG, "犬の年齢は" + dog.age + "歳です。")*/

            /*val bigdog = BigDog("ヨーゼフ", 15)     // 名前をヨーゼフ、年齢15歳で、BigDogのインスタンスを作る

            bigdog.say()
            Log.d(MY_TAG, "犬の名前は" + bigdog.name + "です。")
            Log.d(MY_TAG, "犬の年齢は" + bigdog.age + "歳です。")*/
        /*val dog = Dog("ポチ", 3)      // 名前をポチ、年齢3歳で、Dogのインスタンスを作る

        dog.move()*/
        val human1=Human("okamura",41,"スマホ")
        val human2=Human("岡村",12,"PC")
        human1.say()
        human1.think()
        human2.say()
        human2.think()
    }
}