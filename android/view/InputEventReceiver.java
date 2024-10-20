package android.view;

import X.0Q8;
import android.os.Looper;

/* loaded from: InputEventReceiver.class */
public abstract class InputEventReceiver {
    public InputEventReceiver(InputChannel inputChannel, Looper looper) {
        throw 0Q8.createAndThrow();
    }

    public abstract void dispose();

    public abstract void onInputEvent(InputEvent inputEvent);
}
