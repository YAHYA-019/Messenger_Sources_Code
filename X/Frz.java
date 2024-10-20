package X;

import android.content.Context;
import com.facebook.stash.core.Stash;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: Frz.class */
public abstract class Frz implements AnonymousClass137 {
    public final Stash A00;

    public Frz(Stash stash) {
        this.A00 = stash;
    }

    @Override // X.AnonymousClass137
    public 13G B5T(Context context, 13S r303) {
        byte[] readResourceToMemory = this.A00.readResourceToMemory(r303.A02);
        if (readResourceToMemory == null) {
            throw new IOException("Missing key");
        }
        Charset forName = Charset.forName("UTF8");
        11T.A0A(forName);
        return new 13G(r303, new String(readResourceToMemory, forName));
    }

    @Override // X.AnonymousClass137
    public Set BYL(Context context) {
        Set allKeys = this.A00.getAllKeys();
        allKeys.remove("LAST_UPDATED");
        HashSet hashSet = new HashSet(allKeys.size());
        Iterator it = allKeys.iterator();
        while (it.hasNext()) {
            hashSet.add(13S.A00(AnonymousClass001.A0i(it)));
        }
        return hashSet;
    }

    @Override // X.AnonymousClass137
    public boolean Cf2(Context context, 13S r303) {
        11T.A0F(r303, 1);
        return this.A00.remove(r303.A02);
    }

    @Override // X.AnonymousClass137
    public boolean CqM(Context context, 13G r303) {
        11T.A0F(r303, 1);
        Stash stash = this.A00;
        String str = r303.A00.A02;
        String str2 = r303.A01;
        Charset forName = Charset.forName("UTF8");
        11T.A0A(forName);
        stash.write(str, DKC.A1a(str2, forName));
        return true;
    }

    @Override // X.AnonymousClass137
    public void CqS(long j) {
        ByteBuffer order = ByteBuffer.allocate(8).order(ByteOrder.nativeOrder());
        order.putLong(j);
        this.A00.write("LAST_UPDATED", order.array());
    }
}
