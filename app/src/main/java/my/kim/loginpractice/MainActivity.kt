package my.kim.loginpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        loginBtn.setOnClickListener { 
            val inputEmail = emailEdt.text.toString()
            val inputPW = pwEdt.text.toString()
            
            //email과 pw 확인하여 같거나 다른 경우 처리가 다름 조건문 사용법 익히기
            if(inputEmail=="admin@test.com" && inputPW =="qwer")
            {
                Log.d("로그인 확인","관리자 맞음")
                Toast.makeText(this,"관리자입니다",Toast.LENGTH_SHORT).show()
            }
            else
            {
                Log.d("로그린 확인","관리자 아님")

                Toast.makeText(this,"로그인샐패했습니다.",Toast.LENGTH_SHORT).show()
            }
            
        }

        eventBtn.setOnClickListener{

            Log.d("이벤트 확인","버튼 클릭") 
            Log.d("이벤트 확인","에러로그 발생")
            
            Toast.makeText(this,"버튼이 클릭 됨",Toast.LENGTH_SHORT).show()

            val inputContent = contentEdt.text.toString()
            eventBtn.text = inputContent


        }
    }
}
