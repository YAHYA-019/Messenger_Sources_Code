package X;

import android.net.Uri;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: L41.class */
public class L41 {
    public static final Pattern A02 = Pattern.compile("^(.*\\/)(live-dash.*)");
    public String A00;
    public final Uri A01;

    public L41(Uri uri) {
        Uri.Builder buildUpon = uri.buildUpon();
        buildUpon.clearQuery();
        Uri build = buildUpon.build();
        this.A01 = build;
        String path = build.getPath();
        if (path != null) {
            Matcher matcher = A02.matcher(path);
            if (matcher.find() && matcher.groupCount() == 2) {
                this.A00 = matcher.group(2);
            }
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof L41)) {
            return false;
        }
        L41 l41 = (L41) obj;
        String str = this.A00;
        return str != null ? str.equals(l41.A00) : this.A01.equals(l41.A01);
    }

    public int hashCode() {
        String str = this.A00;
        return str != null ? str.hashCode() : this.A01.hashCode();
    }

    public String toString() {
        return this.A01.toString();
    }
}
