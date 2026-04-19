package com.jarvis;

import android.accessibilityservice.AccessibilityService;
import android.view.accessibility.AccessibilityEvent;
import android.content.Intent;
import android.util.Log;

public class BubbleService extends AccessibilityService {
    private static final String TAG = "BubbleService";

    @Override
    public void onAccessibilityEvent(AccessibilityEvent event) {
        // Handle accessibility events here
        Log.d(TAG, "Event received: " + event.toString());
    }

    @Override
    public void onInterrupt() {
        Log.d(TAG, "Service interrupted");
    }

    @Override
    protected void onServiceConnected() {
        super.onServiceConnected();
        Log.d(TAG, "Service connected");
    }

    @Override
    public android.os.IBinder onBind(Intent intent) {
        if ("android.accessibilityservice.AccessibilityService".equals(intent.getAction())) {
            return super.onBind(intent);
        }
        return null;
    }
}
