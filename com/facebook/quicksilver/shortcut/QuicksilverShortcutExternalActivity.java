package com.facebook.quicksilver.shortcut;

import X.0FI;
import X.11T;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

/* loaded from: QuicksilverShortcutExternalActivity.class */
public final class QuicksilverShortcutExternalActivity extends Activity {
    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        int A00 = 0FI.A00(279661201);
        super.onCreate(bundle);
        Object newInstance = Class.forName("com.facebook.quicksilver.shortcut.QuicksilverShortcutExternalAction").getConstructor(Context.class).newInstance(this);
        11T.A0I(newInstance, "null cannot be cast to non-null type com.facebook.quicksilver.shortcut.QuicksilverShortcutExternalActivity.IntentAction");
        QuicksilverShortcutExternalAction quicksilverShortcutExternalAction = (QuicksilverShortcutExternalAction) newInstance;
        Intent intent = getIntent();
        11T.A0A(intent);
        quicksilverShortcutExternalAction.handle(intent);
        finish();
        0FI.A07(211219378, A00);
    }
}
