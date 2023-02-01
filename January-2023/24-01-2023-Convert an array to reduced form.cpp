//User function template for C++
class Solution{
public:	
	// Converts arr[0..n-1] to reduced form.
	void convert(int arr[], int n) {
	    // code here
	    priority_queue<pair<int,int>,vector<pair<int,int>>,greater<pair<int,int>>>q;
	    for(int i=0;i<n;i++){
	        q.push({arr[i],i});
	    }
	  int i=0;
	  while(!q.empty()){
	       auto p=q.top();
	       q.pop();
	        arr[p.second]=i++;
	    }
	}
};
