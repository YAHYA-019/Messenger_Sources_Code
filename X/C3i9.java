package X;

import android.content.Context;

/* renamed from: X.3i9, reason: invalid class name */
/* loaded from: 3i9.class */
public final class C3i9 implements Runnable {
    public static final String __redex_internal_original_name = "NoteNotificationOpener$checkNotesSyncGroupStatus$1";
    public final /* synthetic */ long A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ C3MJ A02;
    public final /* synthetic */ 2kU A03;

    public C3i9(Context context, C3MJ c3mj, 2kU r304, long j) {
        this.A03 = r304;
        this.A01 = context;
        this.A00 = j;
        this.A02 = c3mj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        2kU r0 = this.A03;
        2kU.A02(this.A01, this.A02, r0, this.A00);
    }
}
