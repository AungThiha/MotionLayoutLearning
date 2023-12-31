package thiha.aung.motion

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // color transition
        findViewById<Button>(R.id.simpleViewLeftRightButton).setOnClickListener {
            startActivity(SimpleViewLefRightActivity.createIntent(this))
        }

        // cross fade
        findViewById<Button>(R.id.imageFilterFaceButton).setOnClickListener {
            startActivity(ImageFilterFaceActivity.createIntent(this))
        }

        // image filter saturation
        findViewById<Button>(R.id.imageFilterSaturationButton).setOnClickListener {
            startActivity(ImageFilterSaturationActivity.createIntent(this))
        }

        // position keyframe
        findViewById<Button>(R.id.positionKeyFrameButton).setOnClickListener {
            startActivity(PositionKeyframeActivity.createIntent(this))
        }

        // attribute keyframe
        findViewById<Button>(R.id.attributeKeyFrameButton).setOnClickListener {
            startActivity(AttributeKeyframeActivity.createIntent(this))
        }

        // airplane keyframe
        findViewById<Button>(R.id.airplaneButton).setOnClickListener {
            startActivity(AirplaneActivity.createIntent(this))
        }

        findViewById<Button>(R.id.rotatingTextCoordinatorLayoutButton).setOnClickListener {
            startActivity(RotatingTextCoordinatorLayoutActivity.createIntent(this))
        }

        findViewById<Button>(R.id.drawerButton).setOnClickListener {
            startActivity(DrawerActivity.createIntent(this))
        }
    }
}