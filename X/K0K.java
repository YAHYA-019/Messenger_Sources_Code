package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.exoplayer2.util.Util;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.json.JSONException;

/* loaded from: K0K.class */
public final class K0K extends LaD implements Handler.Callback {
    public List A00;
    public final Handler A01;
    public final C6X2 A02;

    public K0K(Looper looper, C6X2 c6x2, 6X7 r304, String str) {
        super(new 6X9(looper, r304, c6x2, (String) null));
        this.A01 = looper == null ? null : new Handler(looper, this);
        this.A02 = c6x2;
        if (str == null || str.isEmpty()) {
            return;
        }
        try {
            this.A00 = R3e.A00(str);
        } catch (JSONException unused) {
            android.util.Log.e("HeroMetadataRenderer", "Error in parsing IMF spec");
        }
    }

    public void CfO(long j, long j2) {
        List list = this.A00;
        if (list != null) {
            UUID uuid = 6Za.A04;
            long A0C = Util.A0C(j);
            Handler handler = this.A01;
            if (handler != null) {
                4YU.A1G(handler, Long.valueOf(A0C), 1);
            } else {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }
        }
        super.CfO(j, j2);
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        List list;
        if (message.what != 1) {
            throw JQx.A0o();
        }
        if (message.obj != null && (list = this.A00) != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
        return true;
    }
}
