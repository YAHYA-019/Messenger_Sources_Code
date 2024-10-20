package X;

import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.wearable.common.comms.hera.shared.engine.consts.ConstantsKt;

/* renamed from: X.2iF, reason: invalid class name */
/* loaded from: 2iF.class */
public final class C2iF {
    public Boolean A00;
    public java.util.Map A01;
    public final Context A02;
    public final 06Z A03;
    public final LifecycleOwner A04;
    public final FbUserSession A05;
    public final CallerContext A06;
    public final 1pI A07;
    public final 1Br A08;
    public final 2YD A0C;
    public final 2YQ A0D;
    public final String A0E;
    public final 1Br A0A = 1Bq.A00(16766);
    public final 1Br A0B = 1Bq.A00(16973);
    public final 1Br A09 = 1Bq.A00(66932);

    public C2iF(Context context, 06Z r303, LifecycleOwner lifecycleOwner, FbUserSession fbUserSession, CallerContext callerContext, 1pI r307, 2YD r308, 2YQ r309, String str) {
        this.A02 = context;
        this.A03 = r303;
        this.A04 = lifecycleOwner;
        this.A07 = r307;
        this.A0C = r308;
        this.A0D = r309;
        this.A06 = callerContext;
        this.A0E = str;
        this.A05 = fbUserSession;
        this.A08 = 1Bu.A01(context, 67053);
    }

    public static final java.util.Map A00(C2iF c2iF) {
        java.util.Map map = c2iF.A01;
        if (map == null) {
            Boolean bool = c2iF.A00;
            if (bool == null) {
                bool = Boolean.valueOf(1XU.A00(c2iF.A02));
                c2iF.A00 = bool;
            }
            11T.A0D(bool);
            map = 02J.A01(new 03Y("ch", bool.booleanValue() ? ConstantsKt.CAMERA_ID_BACK : ConstantsKt.CAMERA_ID_FRONT));
            c2iF.A01 = map;
        }
        11T.A0D(map);
        return map;
    }
}
