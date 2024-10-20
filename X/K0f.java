package X;

import com.google.common.base.Charsets;
import java.nio.charset.CharsetDecoder;
import java.util.regex.Pattern;

/* loaded from: K0f.class */
public final class K0f extends Lb0 {
    public static final Pattern A02 = Pattern.compile("(.+?)='(.*?)';", 32);
    public final CharsetDecoder A01 = Charsets.UTF_8.newDecoder();
    public final CharsetDecoder A00 = Charsets.ISO_8859_1.newDecoder();
}
