package X;

import android.content.Context;
import android.net.Uri;
import java.io.File;
import kotlin.jvm.functions.Function1;

/* loaded from: Inb.class */
public final class Inb implements 1K9 {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ IDb A01;
    public final /* synthetic */ File A02;
    public final /* synthetic */ Function1 A03;
    public final /* synthetic */ boolean A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ boolean A06;

    public Inb(Context context, IDb iDb, File file, Function1 function1, boolean z, boolean z2, boolean z3) {
        this.A04 = z;
        this.A02 = file;
        this.A06 = z2;
        this.A01 = iDb;
        this.A00 = context;
        this.A05 = z3;
        this.A03 = function1;
    }

    public void onFailure(Throwable th) {
        11T.A0F(th, 0);
        0fH.A0s("SaveToGalleryDownloader", "Unable to save file", th);
        this.A03.invoke(4YW.A0A("reason for failure", 0Pz.A1B("Unable to save file: ", th), 1BK.A1G("save result", "false")));
        if (this.A06) {
            return;
        }
        9aT r0 = (9aT) 1Br.A0B(this.A01.A03);
        Context context = this.A00;
        int i = 2131967902;
        if (this.A05) {
            i = 2131957793;
        }
        r0.A00(context, i);
    }

    public void onSuccess(Object obj) {
        if (this.A04) {
            boolean z = IFs.A0M;
            I1O.A00.A00(new IFs(this.A02.getAbsolutePath()));
        }
        if (!this.A06) {
            9aT r0 = (9aT) 1Br.A0B(this.A01.A03);
            Context context = this.A00;
            int i = 2131967903;
            if (this.A05) {
                i = 2131957794;
            }
            r0.A00(context, i);
        }
        this.A03.invoke(4YW.A0A("saved media uri", Uri.fromFile(this.A02).toString(), 1BK.A1G("save result", "true")));
    }
}
