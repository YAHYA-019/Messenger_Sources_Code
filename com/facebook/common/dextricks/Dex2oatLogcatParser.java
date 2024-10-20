package com.facebook.common.dextricks;

import X.0Pz;
import X.AnonymousClass001;
import android.util.Log;
import java.io.File;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: Dex2oatLogcatParser.class */
public class Dex2oatLogcatParser extends LogcatReader {
    public static final Pattern DEX2OAT_STATS_PARSER = Pattern.compile("^(\\d{4}-)?\\d{2}-\\d{2} \\d{2}:\\d{2}:\\d{2}\\.\\d{3}\\s+\\d+\\s+\\d+\\s\\w\\s\\w+\\s*:\\s*(\\d+\\.\\d+)% of (.+) for (\\d+) cases");
    public static final String TAG = "Dex2oatLogcatParser";
    public final int GROUP_IDX_NUM_CASES;
    public final int GROUP_IDX_PERCENT;
    public final int GROUP_IDX_STAT_TYPE;
    public final Set mDex2OatStatInfos;

    /* loaded from: Dex2oatLogcatParser$Dex2OatStatInfo.class */
    public class Dex2OatStatInfo {
        public final int failure;
        public final double percent;
        public final String statType;
        public final int success;
        public final int totalCases;

        public Dex2OatStatInfo(String str, double d, int i) {
            this.statType = str;
            this.percent = d;
            this.totalCases = i;
            int successFromPercentAndTotalCases = Dex2oatLogcatParser.successFromPercentAndTotalCases(d, i);
            this.success = successFromPercentAndTotalCases;
            this.failure = i - successFromPercentAndTotalCases;
        }

        public String toString() {
            StringBuilder A0k = AnonymousClass001.A0k();
            A0k.append("[ Dex2OatStatInfo");
            A0k.append(" Stat Type: \"");
            A0k.append(this.statType);
            A0k.append("\"");
            A0k.append(" Success failure: ");
            int i = this.success;
            A0k.append(i);
            A0k.append(" / (");
            A0k.append(this.totalCases);
            A0k.append(" [or ");
            A0k.append(i);
            A0k.append(" + ");
            A0k.append(this.failure);
            A0k.append("])");
            A0k.append(" => ");
            A0k.append(this.percent);
            return AnonymousClass001.A0d("% ]", A0k);
        }
    }

    public Dex2oatLogcatParser(String str, File file) {
        super(str, file);
        this.GROUP_IDX_PERCENT = 2;
        this.GROUP_IDX_STAT_TYPE = 3;
        this.GROUP_IDX_NUM_CASES = 4;
        this.mDex2OatStatInfos = AnonymousClass001.A0v();
    }

    public static int successFromPercentAndTotalCases(double d, int i) {
        return (int) Math.ceil((d / 100.0d) * i);
    }

    public Set getDex2OatStatInfos() {
        return this.mDex2OatStatInfos;
    }

    @Override // com.facebook.common.dextricks.LogcatReader
    public void processLine(String str) {
        Matcher matcher = DEX2OAT_STATS_PARSER.matcher(str);
        if (matcher == null || !matcher.matches()) {
            return;
        }
        Log.d(TAG, 0Pz.A0W("Found dex2oat stat line: ", str));
        try {
            String group = matcher.group(2);
            String group2 = matcher.group(3);
            String group3 = matcher.group(4);
            Log.i(TAG, String.format("Found percent %s %% stat type: %s and case count: %s ", group, group2, group3));
            this.mDex2OatStatInfos.add(new Dex2OatStatInfo(group2, Double.parseDouble(group), Integer.parseInt(group3)));
        } catch (NumberFormatException e) {
            Log.w(TAG, 0Pz.A0W("Could not process line: ", str), e);
        }
    }

    @Override // com.facebook.common.dextricks.LogcatReader
    public void reset() {
        this.mDex2OatStatInfos.clear();
    }
}
