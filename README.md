# GSON
这个方法的使用和谷歌提供的GSON一种的，类名是MyGSON。
//转成一个Model
new MyGson().fromJson(data, A.class);
//解析成一个List
new MyGson().fromJson(data , new TypeToken<List<A>>(){}.getType());
//一个model转换成一个JSON格式
new MyGson().toJSON(data);
