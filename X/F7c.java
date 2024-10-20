package X;

import android.net.Uri;
import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: F7c.class */
public final class F7c {
    public final ImmutableMap A00 = AbG.A10(new ImmutableMap.Builder(4), "z_free", "free");
    public final ImmutableMap A01;

    public F7c() {
        Pattern[] patternArr = new Pattern[63];
        System.arraycopy(new Pattern[]{Pattern.compile("^i\\.org$"), Pattern.compile("^.*\\.i\\.org$"), Pattern.compile("^internet\\.org$"), Pattern.compile("^.*\\.internet\\.org$"), Pattern.compile("^.*\\.freeb6\\.com$"), Pattern.compile("^.*\\.freeb\\.com$"), Pattern.compile("^fb\\.com$"), Pattern.compile("^www\\.fb\\.com$"), Pattern.compile("^freebasic\\.com$"), Pattern.compile("^.*\\.freebasic\\.com$"), Pattern.compile("^.*\\.freebasik\\.com$"), Pattern.compile("^.*\\.frebasik\\.com$"), Pattern.compile("^facebook\\.com$"), Pattern.compile("^z-m-.*\\.facebook\\.com$"), Pattern.compile("^0\\.facebook\\.com$"), Pattern.compile("^static-0\\.facebook\\.com$"), Pattern.compile("^static\\.0\\.facebook\\.com$"), Pattern.compile("^z-upload\\.facebook\\.com$"), Pattern.compile("^sd\\.facebook\\.com$"), Pattern.compile("^free\\.facebook\\.com$"), Pattern.compile("^people\\.facebook\\.com$"), Pattern.compile("^lite\\.facebook\\.com$"), Pattern.compile("^.*\\.lite\\.facebook\\.com$"), Pattern.compile("^h\\.facebook\\.com$"), Pattern.compile("^b-graph\\.facebook\\.com$"), Pattern.compile("^b-api\\.facebook\\.com$"), Pattern.compile("^feedback\\.facebook\\.com$")}, 0, patternArr, 0, 27);
        System.arraycopy(new Pattern[]{Pattern.compile("^pixel\\.facebook\\.com$"), Pattern.compile("^m\\.facebook\\.com$"), Pattern.compile("^b-m\\.facebook\\.com$"), Pattern.compile("^lm\\.facebook\\.com$"), Pattern.compile("^n\\.facebook\\.com$"), Pattern.compile("^o\\.facebook\\.com$"), Pattern.compile("^z-graph-video\\.facebook\\.com$"), Pattern.compile("^zero\\.facebook\\.com$"), Pattern.compile("^ads\\.facebook\\.com$"), Pattern.compile("^hs\\.facebook\\.com$"), Pattern.compile("^connect\\.facebook\\.com$"), Pattern.compile("^light\\.facebook\\.com$"), Pattern.compile("^about\\.facebook\\.com$"), Pattern.compile("^new\\.facebook\\.com$"), Pattern.compile("^www\\.facebook\\.com$"), Pattern.compile("^b-www\\.facebook\\.com$"), Pattern.compile("^ec-www\\.facebook\\.com$"), Pattern.compile("^x\\.facebook\\.com$"), Pattern.compile("^pay\\.facebook\\.com$"), Pattern.compile("^z\\.facebook\\.com$"), Pattern.compile("^.*\\.z\\.facebook\\.com$"), Pattern.compile("^.*\\.freebs\\.com$"), Pattern.compile("^freebasics\\.com$"), Pattern.compile("^.*\\.freebasics\\.com$"), Pattern.compile("^.*\\.frebasics\\.com$"), Pattern.compile("^.*\\.fbasics\\.com$"), Pattern.compile("^.*\\.freebasicservices\\.com$")}, 0, patternArr, 27, 27);
        System.arraycopy(new Pattern[]{Pattern.compile("^.*\\.freebasiks\\.com$"), Pattern.compile("^.*\\.frebasiks\\.com$"), Pattern.compile("^.*\\.freebasixs\\.com$"), Pattern.compile("^z-m-.*\\.fbsbx\\.com$"), Pattern.compile("^.*\\.freebasix\\.com$"), Pattern.compile("^.*\\.frebasix\\.com$"), Pattern.compile("^z-m-.*\\.fbcdn\\.net$"), Pattern.compile("^0\\.static\\.ak\\.fbcdn\\.net$"), Pattern.compile("^z-m\\.ak\\.fbcdn\\.net$")}, 0, patternArr, 54, 9);
        this.A01 = AbG.A10(new ImmutableMap.Builder(4), "z_free", patternArr);
    }

    public static final F7c A00() {
        return new F7c();
    }

    public boolean A01(Uri uri) {
        String host;
        if (uri == null || !C0Aj.A05(uri) || (host = uri.getHost()) == null) {
            return false;
        }
        Matcher matcher = null;
        1Du A0i = 4YU.A0i(this.A01);
        while (A0i.hasNext()) {
            Map.Entry A0z = AnonymousClass001.A0z(A0i);
            String A1C = AbF.A1C(this.A00, A0z.getKey());
            if (!1JF.A0B(A1C)) {
                boolean equals = A1C.equals("free");
                for (Pattern pattern : (Pattern[]) A0z.getValue()) {
                    if (matcher == null) {
                        matcher = pattern.matcher(host);
                    } else {
                        matcher.usePattern(pattern);
                        matcher.reset();
                    }
                    if (matcher.matches()) {
                        return equals;
                    }
                }
            }
        }
        return false;
    }
}
