package X;

import android.os.Bundle;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.meta.flytrap.attachment.model.BugReportAttachment;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.List;

/* loaded from: F6t.class */
public final class F6t {
    public static F6t A0G;
    public long A00;
    public Bundle A01;
    public EPO A02;
    public ImmutableMap A03;
    public ImmutableSet A04;
    public ImmutableSet A05;
    public BugReportAttachment A06;
    public File A07;
    public File A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public WeakReference A0D;
    public List A0E = AnonymousClass001.A0s();
    public List A0F;

    public static F6t A00() {
        F6t f6t = A0G;
        if (f6t == null) {
            f6t = new F6t();
            A0G = f6t;
        }
        return f6t;
    }
}
