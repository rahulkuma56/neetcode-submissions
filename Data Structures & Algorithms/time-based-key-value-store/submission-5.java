class TimeMap {
    Map<String, Map<Integer, String>> map = new HashMap<>();

    public TimeMap() {
        
    }
    
    public void set(String key, String value, int timestamp) {
        if(map.containsKey(key)){
            map.get(key).put(timestamp, value);
        }else{
            Map<Integer, String> timeMap= new HashMap<>();
            timeMap.put(timestamp, value);
            map.put(key, timeMap);
        }
        
    }
    
    public String get(String key, int timestamp) {
        if(!map.containsKey(key)){
            return "";
        }
        Map<Integer, String> timeMap = map.get(key);
        
        while(timestamp>0){
            System.out.println("timestamp::"+ timestamp);
             System.out.println("Map::"+map.toString());
            if(timeMap.containsKey(timestamp)){
                System.out.println("return"+ timeMap.get(timestamp).toString());
                return timeMap.get(timestamp);
            }                     
            timestamp--;
            }
            return "";
        


        
    }
}
