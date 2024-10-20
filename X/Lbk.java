package X;

import android.net.Uri;
import android.text.TextUtils;
import com.google.common.base.Charsets;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: Lbk.class */
public final class Lbk implements MG4 {
    public static final Pattern A00 = Pattern.compile("(.+?)(Z|((\\+|-|−)(\\d\\d)(:?(\\d\\d))?))");

    @Override // X.MG4
    public /* bridge */ /* synthetic */ Object CWe(Uri uri, InputStream inputStream) {
        String readLine = new BufferedReader(new InputStreamReader(inputStream, Charsets.UTF_8)).readLine();
        try {
            Matcher matcher = A00.matcher(readLine);
            if (!matcher.matches()) {
                throw KLu.A01(0Pz.A0W("Couldn't parse timestamp: ", readLine), (Throwable) null);
            }
            String group = matcher.group(1);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            long time = simpleDateFormat.parse(group).getTime();
            if (!"Z".equals(matcher.group(2))) {
                long j = "+".equals(matcher.group(4)) ? 1L : -1;
                long parseLong = Long.parseLong(matcher.group(5));
                String group2 = matcher.group(7);
                long parseLong2 = TextUtils.isEmpty(group2) ? 0L : Long.parseLong(group2);
                long j2 = 60;
                time -= j * ((((parseLong * j2) + parseLong2) * j2) * 1000);
            }
            return Long.valueOf(time);
        } catch (ParseException e) {
            throw KLu.A01((String) null, e);
        }
    }
}
