package X;

import android.text.Spannable;
import android.text.style.ClickableSpan;
import com.facebook.common.util.TriState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.regex.Matcher;

/* renamed from: X.6my, reason: invalid class name */
/* loaded from: 6my.class */
public final class C6my {
    public final C00i A01 = new 1BQ(49474);
    public final C00i A03 = new 1BQ(49865);
    public final C00i A02 = new 1BV(66679);
    public final C00i A00 = new 1BV(66952);
    public final C15h A04 = new AHe(this, 51);

    /* JADX WARN: Type inference failed for: r0v60, types: [java.lang.Object, X.53u] */
    public boolean A00(Spannable spannable, C5n1 c5n1) {
        boolean z;
        StringBuilder A0n;
        String str;
        String str2;
        if (this.A04.get() != TriState.YES) {
            return false;
        }
        ArrayList A0s = AnonymousClass001.A0s();
        Matcher matcher = R4k.A00.matcher(spannable);
        while (true) {
            z = false;
            if (!matcher.find()) {
                break;
            }
            int start = matcher.start();
            int end = matcher.end();
            ?? obj = new Object();
            String group = matcher.group(0);
            String upperCase = group.toUpperCase(Locale.US);
            if (upperCase.startsWith("D")) {
                A0n = AnonymousClass001.A0k();
                A0n.append("https://www.internalfb.com/");
                A0n.append(upperCase);
            } else {
                if (upperCase.startsWith("T")) {
                    A0n = AnonymousClass001.A0k();
                    str2 = "https://www.internalfb.com/intern/tasks/?t=";
                } else if (upperCase.startsWith("S")) {
                    A0n = AnonymousClass001.A0k();
                    str2 = "https://www.internalfb.com/intern/sevmanager/view/s/";
                } else {
                    if (!upperCase.startsWith("RE") && !upperCase.startsWith("NWT") && !upperCase.startsWith("ME") && !upperCase.startsWith("L")) {
                        if (upperCase.startsWith("G")) {
                            A0n = AnonymousClass001.A0k();
                            str2 = "https://www.internalfb.com/intern/goals/G";
                        } else if (upperCase.startsWith("P")) {
                            A0n = AnonymousClass001.A0k();
                            str2 = "https://www.internalfb.com/intern/paste/P";
                        } else if (!upperCase.startsWith("CCN")) {
                            str = "";
                            if (upperCase.startsWith("C") || upperCase.startsWith("C#")) {
                                A0n = AnonymousClass001.A0k();
                                A0n.append("https://www.internalfb.com/cases/");
                                group = group.replaceAll("\\D+", str);
                            } else if (upperCase.startsWith("X")) {
                                A0n = AnonymousClass001.A0k();
                                str2 = "https://www.internalfb.com/intern/chronos/lucky/?query=";
                            } else if (!upperCase.startsWith("WIKI-")) {
                                if (upperCase.startsWith("IT")) {
                                    A0n = AnonymousClass001.A0k();
                                    A0n.append("https://www.internalfb.com/buy/store/devices/devices/?asset_tag=");
                                } else {
                                    obj.A02 = str;
                                    obj.A01 = start;
                                    obj.A00 = end;
                                    A0s.add(obj);
                                }
                            }
                            A0n.append(group);
                        }
                    }
                    A0n = AnonymousClass001.A0n("https://www.internalfb.com/intern/bunny/?q=");
                    A0n.append(group);
                }
                A0n.append(str2);
                group = group.substring(1);
                A0n.append(group);
            }
            str = A0n.toString();
            obj.A02 = str;
            obj.A01 = start;
            obj.A00 = end;
            A0s.add(obj);
        }
        if (!A0s.isEmpty()) {
            Iterator it = A0s.iterator();
            while (it.hasNext()) {
                C53u c53u = (C53u) it.next();
                ClickableSpan[] Atx = c5n1.Atx(spannable, c53u.A01, c53u.A00);
                int length = Atx.length;
                int i = 0;
                while (true) {
                    int i2 = i;
                    if (i2 < length) {
                        ClickableSpan clickableSpan = Atx[i2];
                        if (spannable.getSpanStart(clickableSpan) > c53u.A01) {
                            spannable.removeSpan(clickableSpan);
                        }
                        i = i2 + 1;
                    }
                }
                c5n1.A8v(spannable, c53u.A01, c53u.A00, c53u.A02);
            }
            z = true;
        }
        return z;
    }
}
