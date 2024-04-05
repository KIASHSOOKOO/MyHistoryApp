package com.example.myhistoryapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /* Declarations */
        val ageEditText = findViewById<EditText>(R.id.age)
        val answerText = findViewById<TextView>(R.id.answer)
        val generatebutton = findViewById<Button>(R.id.generate)
        val clearbutton = findViewById<Button>(R.id.clear)

        generatebutton.setOnClickListener {
            val age = ageEditText.text.toString().toIntOrNull()
            if (age == null) {
                answerText.text = "enter valid age"

            } else {
                if (age < 20 || age > 100) {
                    answerText.text = "please enter an age between 20 and 100"
                    ageEditText.text.clear()
                } else {
                    val answer = when (age) {
                        95 -> "Nelson Mandela was the president of South Africa from 1994-1999. He was the first black president of South Africa, and the first president to be elected in a fully representative election."
                        67 -> "leonardo da Vinci, Leonardo da Vinci (1452-1519) was a painter, sculptor, architect, writer, anatomist, geologist, astronomer, botanist, inventor, engineer and scientist – the epitome of a Renaissance man. Widely considered to be one of the greatest artists of all time, his most famous works included ‘the Mona Lisa’, ‘the Last Supper’ and ‘the Vitruvian Man’."
                        74 -> "Muhammad Ali, American professional boxer and activist. Nicknamed the Greatest, he is regarded as one of the most significant sports figures of the 20th century and is often regarded as the greatest heavyweight boxer of all time."
                        78 -> "Mahatma Ghandi, Mohandas Karamchand Gandhi was born to a Hindu family on 2 October 1869, in Porbandar, Gujarat, India. He was the last child of Karamchand Gandhi, his father and his father's fourth wife Putlibai. His father, a lawyer and an important government official, belonged to the merchant caste."
                        44 -> "Pablo escobar, Escobar was arguably the world's most powerful drug trafficker in the 1980s and early '90s. Soon after his birth, Escobar's family—his father was a farmer and his mother a schoolteacher—moved to Envigado, Colombia, a suburb of Medellín. While still a teenager, he began a life of crime"
                        50 -> "Michael Jackson, As a member of the Jackson 5 (later known as the Jacksons), Jackson, the eighth child of the Jackson family, made his public debut in 1964 alongside his older brothers Jackie, Tito, Jermaine, and Marlon. While working at Motown Records in 1971, Jackson started his solo career. His 1979 album Off the Wall catapulted him into solo stardom"
                        42 -> "Elvis Presly, At the age of thirteen, Presley's family moved from Tupelo, Mississippi, where Elvis was born, to Memphis, Tennessee. His musical career started there in 1954 at Sun Records under the direction of producer Sam Phillips, who aimed to popularize African-American music."
                        44 -> "Steve Irwin, On February 22, 1962, in Upper Ferntree Gully, Victoria, Stephen Robert Irwin was born. In 1970, his parents established the Beerwah Reptile Park after relocating their family to Queensland. Steve grew up with a passion for all animals, but especially for reptiles."
                        76 -> "Steven Hawking, Stephen Hawking was an English theoretical physicist who was born in Oxford, Oxfordshire, England, on January 8, 1942, and passed away in Cambridge, Cambridgeshire, on March 14, 2018. His hypothesis of bursting black holes was based on both relativity theory and quantum mechanics. He dealt with space-time singularities as well."
                        76 -> "Albert Einstein, German-born physicist Albert Einstein was born in Ulm, Württemberg, on March 14, 1879, and passed away in Princeton, New Jersey, on April 18, 1955. He is best known for developing the special and general theories of relativity and for explaining the photoelectric effect, which earned him the 1921 Nobel Prize in Physics."

                        else -> "age does not exist, try a different one"

                    }
                    answerText.text = answer

                }


            }
            clearbutton.setOnClickListener {
                ageEditText.text.clear()
                answerText.text = ""
            }


        }
    }
}





