/**
 *
 *  @author Ossowski Marcin S16425
 *
 */

package zad1;

import java.io.File;
import java.io.FileInputStream;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import javax.naming.directory.InvalidAttributeIdentifierException;

import org.yaml.snakeyaml.Yaml;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;
import com.sun.swing.internal.plaf.metal.resources.metal_zh_TW;


public class Tools {
	
	
	
	Map<String, List<String>> map = new LinkedHashMap<>();

	public static Options createOptionsFromYaml(String fileName) throws Exception{

			
			Yaml yaml = new Yaml();
			FileInputStream fileInputStream = new FileInputStream(fileName);
			
			Map <String, Object> map =  yaml.load(fileInputStream);
			Options options = new Options(String.valueOf(map.get("host")), (int)map.get("port"), (boolean)map.get("concurMode"), (boolean)map.get("showSendRes"), (Map<String, List<String>>)(map.get("clientsMap")));
			
		
		
		
		return options;
	}
}
