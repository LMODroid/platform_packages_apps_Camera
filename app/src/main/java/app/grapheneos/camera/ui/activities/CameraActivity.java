package app.grapheneos.camera.ui.activities;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import app.grapheneos.camera.CameraMode;
import app.grapheneos.camera.util.CameraModeUtil;

public class CameraActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        CameraModeUtil.launchCameraWithMode(getApplicationContext(), CameraMode.CAMERA);
        finish();
    }
}
