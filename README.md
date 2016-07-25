# GSON</br>
这个方法的使用和谷歌提供的GSON一种的，类名是MyGSON。</br>
//转成一个Model</br>
new MyGson().fromJson(data, A.class);</br>
//解析成一个List</br>
new MyGson().fromJson(data , new TypeToken<List<A>>(){}.getType());</br>
//一个model转换成一个JSON格式</br>
new MyGson().toJSON(data);
