package X;

import android.content.ContextWrapper;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.graphql.query.GraphQlQueryParamSet;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.zip.CRC32;

/* loaded from: G5z.class */
public final class G5z implements Runnable {
    public static final String __redex_internal_original_name = "ChangePlayerStateMutationHelper$mutate$1";
    public final /* synthetic */ FbUserSession A00;
    public final /* synthetic */ 1Br A01;
    public final /* synthetic */ EtO A02;
    public final /* synthetic */ Eo8 A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;

    public G5z(FbUserSession fbUserSession, 1Br r303, EtO etO, Eo8 eo8, String str, String str2) {
        this.A05 = str;
        this.A02 = etO;
        this.A03 = eo8;
        this.A04 = str2;
        this.A00 = fbUserSession;
        this.A01 = r303;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Eft eft = (Eft) 1Br.A0B(this.A01);
        String str = this.A05;
        try {
            try {
                File A0E = AnonymousClass001.A0E(0Pz.A0j(new ContextWrapper(eft.A00).getFilesDir().getAbsolutePath(), File.separator, "player_state_file_path"));
                if (!A0E.exists()) {
                    A0E.mkdirs();
                }
                File A0D = AnonymousClass001.A0D(A0E, "playerState");
                A0D.deleteOnExit();
                FileWriter fileWriter = new FileWriter(A0D);
                try {
                    fileWriter.write(str);
                    try {
                        fileWriter.close();
                    } catch (IOException unused) {
                    }
                    Eo8 eo8 = this.A03;
                    EtQ etQ = (EtQ) 1Br.A0B(eo8.A03);
                    CRC32 crc32 = new CRC32();
                    crc32.update(DKC.A1a(str, C03r.A05));
                    try {
                        ICS ics = (ICS) etQ.A00(A0D, DKC.A1B(C1uK.A02(crc32.getValue()), 8)).get();
                        07S A0J = 4YU.A0J(GraphQlCallInput.A02, this.A04, "app_id");
                        GraphQlQueryParamSet A0N = 4YU.A0N(A0J, ics.A05, "player_state_file_handle");
                        4YV.A1A(A0J, A0N, "data");
                        5Dh A00 = 5Dh.A00(A0N, new C01643sd(C2234Dhq.class, "ChangePlayerStateMutation", null, "data", "fbandroid", 689200118, 384, 1273129524L, 1273129524L, false, true));
                        1Vd A0N2 = DKH.A0N(eo8.A00);
                        DKH.A1H(A00);
                        ListenableFuture A08 = A0N2.A08(A00, 5Dj.A01);
                        1Br.A0D(eo8.A02, FwK.A01(this.A02, 35), A08);
                    } catch (InterruptedException | ExecutionException unused2) {
                        this.A02.A00();
                    }
                } catch (IOException unused3) {
                    fileWriter.close();
                    EtO etO = this.A02;
                    new Throwable("Could not generate playerState file for ChangePlayerState");
                    etO.A00();
                } catch (Throwable th) {
                    th = th;
                    try {
                        fileWriter.close();
                        throw th;
                    } catch (IOException unused4) {
                        throw th;
                    }
                }
            } catch (IOException unused5) {
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
