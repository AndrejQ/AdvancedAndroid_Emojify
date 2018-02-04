package com.example.android.emojify;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import android.util.SparseArray;
import android.widget.Toast;

import com.google.android.gms.vision.Frame;
import com.google.android.gms.vision.face.Face;
import com.google.android.gms.vision.face.FaceDetector;

/**
 * Created by Asus123 on 05.02.2018.
 */

public class Emojifier {
    public static void detectFaces(Context context, Bitmap bitmap){
        Frame frame = new Frame.Builder().setBitmap(bitmap).build();
        FaceDetector detector = new FaceDetector.Builder(context)
                .setTrackingEnabled(false)
                .setClassificationType(FaceDetector.ALL_CLASSIFICATIONS)
                .build();
        SparseArray<Face> faces = detector.detect(frame);
        Toast.makeText(context, faces.size() + "faces detected", Toast.LENGTH_SHORT).show();
    }
}
