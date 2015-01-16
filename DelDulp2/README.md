删除重复节点 只保留没有重复的节点：

special case:
头结点就重复了
solution: 再加一个head指向原head 这样最终返回head.next 
		  并且需要在找到第一个不重复的节点后将head.next定位到它

isdup用来鉴别当前情况 true：之前有重复 且现在重复已经结束了
					  false：之前没重复 该怎么走怎么走

