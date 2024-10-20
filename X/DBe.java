package X;

import android.content.Context;
import com.facebook.acra.constants.ActionId;

/* loaded from: DBe.class */
public final class DBe implements C15h {
    public final int A00;
    public final Object A01;

    public DBe(Context context, int i) {
        this.A00 = i;
        switch (i) {
            case 30:
            case 31:
            case 42:
            case ActionId.ON_CREATE_VIEW_END /* 45 */:
            case 46:
            case ActionId.ACTIVITY_STARTED /* 76 */:
            case ActionId.ACTIVITY_RESUMED /* 77 */:
            case ActionId.FRAGMENT_CREATED /* 78 */:
            case ActionId.METHOD_INVOKE /* 88 */:
            case ActionId.VIDEO_PLAYING /* 116 */:
            case ActionId.RTMP_CONNECTION_FAILED /* 118 */:
            case ActionId.RTMP_CONNECTION_INTERCEPTED /* 119 */:
            case ActionId.VIDEO_SET_RENDERER_CONTEXT /* 120 */:
            case ActionId.CARD_DATA_LOADED /* 122 */:
            case ActionId.BEGIN_START_ACTIVITY /* 145 */:
            case ActionId.SERVICE_ON_START_COMMAND /* 156 */:
            case ActionId.ON_ATTACH_FRAGMENT /* 163 */:
                this.A01 = context;
                return;
            default:
                this.A01 = context;
                return;
        }
    }

    public DBe(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static DBe A00(Object obj, int i) {
        return new DBe(obj, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:147:0x091c, code lost:
    
        if (X.C1gb.A01(r0).AZk(36321322947264710L) != false) goto L145;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    @Override // X.C15h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* bridge */ /* synthetic */ java.lang.Object get() {
        /*
            Method dump skipped, instructions count: 3801
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DBe.get():java.lang.Object");
    }
}
