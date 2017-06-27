package algo;

import java.util.Map;

import com.google.common.base.Splitter;

public class SplitToMap {
    public static Map<String, String> splitToMap(String in) {
    	if (in.charAt(0) == '{') {
    		in = in.substring(1);
    	}
    	if (in.charAt(in.length() - 1) == '}') {
    		in = in.substring(0, in.length() - 1);
    	}
        return Splitter.on(", ").withKeyValueSeparator("=").split(in);
    }
}
