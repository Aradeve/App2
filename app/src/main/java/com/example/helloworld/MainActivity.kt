// المسار: app/src/main/java/com/example/helloworld/MainActivity.kt
package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.helloworld.databinding.ActivityMainBinding

/**
 * MainActivity هي الشاشة الرئيسية للتطبيق.
 * يتم تشغيلها عند إطلاق التطبيق.
 */
class MainActivity : AppCompatActivity() {

    // متغير لربط عناصر واجهة المستخدم بالكود (View Binding)
    private lateinit var binding: ActivityMainBinding

    /**
     * هذه الدالة تُستدعى عند إنشاء الـ Activity لأول مرة.
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // تضخيم (Inflate) التخطيط باستخدام View Binding
        binding = ActivityMainBinding.inflate(layoutInflater)
        // تعيين واجهة المستخدم لهذه الـ Activity
        setContentView(binding.root)

        // يمكن الوصول إلى العناصر مباشرة عبر متغير binding
        // في هذا المثال، النص محدد بالفعل في ملف الـ XML،
        // ولكن إذا أردت تغييره برمجياً، يمكنك فعل ذلك هكذا:
        // binding.helloTextView.text = "أهلاً بك في Kotlin"
    }
}
