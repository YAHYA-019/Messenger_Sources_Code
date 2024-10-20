package androidx.profileinstaller;

import X.0Un;
import X.0Uo;
import X.0Ux;
import android.content.Context;
import android.view.Choreographer;
import java.util.Collections;
import java.util.List;

/* loaded from: ProfileInstallerInitializer.class */
public class ProfileInstallerInitializer implements 0Ux {
    public /* bridge */ /* synthetic */ Object create(Context context) {
        Choreographer.getInstance().postFrameCallback(new 0Uo(new 0Un(context.getApplicationContext(), this)));
        return new Object();
    }

    public List dependencies() {
        return Collections.emptyList();
    }
}
