package X;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.regex.Matcher;

/* loaded from: Frs.class */
public final class Frs implements C08j {
    public Set A00;
    public Set A01;
    public boolean A02;

    @Override // X.C08j
    public ArrayList Ara() {
        ArrayList A0s = AnonymousClass001.A0s();
        A0s.add(new IntentFilter("com.google.android.gms.auth.api.phone.SMS_RETRIEVED"));
        return A0s;
    }

    @Override // X.C08j
    public void CFb(Context context, Intent intent, C01q c01q) {
        Status status;
        Set<FEY> set;
        if (!this.A02) {
            this.A00 = 1Bi.A06(216);
            this.A01 = 1Bi.A06(217);
            this.A02 = true;
        }
        Bundle extras = intent.getExtras();
        if (extras == null || (status = (Status) extras.get("com.google.android.gms.auth.api.phone.EXTRA_STATUS")) == null) {
            return;
        }
        int i = status.A00;
        if (i != 0) {
            if (i == 15) {
                0fH.A0j("SmsCodeActionReceiver", "SMS retriever timed out.");
                Set set2 = this.A01;
                if (set2 != null) {
                    Iterator it = set2.iterator();
                    while (it.hasNext()) {
                        it.next();
                    }
                    return;
                }
                return;
            }
            return;
        }
        String str = (String) extras.get("com.google.android.gms.auth.api.phone.EXTRA_SMS_MESSAGE");
        0fH.A0g(str, "SmsCodeActionReceiver", "SMS retriever received auth message: %s");
        Set set3 = this.A01;
        if (set3 != null) {
            Iterator it2 = set3.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
        if (str == null || (set = this.A00) == null) {
            return;
        }
        for (FEY fey : set) {
            Matcher matcher = FEY.A04.matcher(str);
            fey.A02.post(new SBa(fey, matcher.find() ? matcher.group(1) : null));
        }
    }
}
