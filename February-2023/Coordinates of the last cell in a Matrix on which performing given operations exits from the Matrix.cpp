//User function Template for C++

class Solution{
    public:
    pair<int,int> endPoints(vector<vector<int>> matrix){
        //code here
        pair<int,int> res;
        map<pair<int,int>,pair<int,int>> change;
        change[{-1,0}]={0,1}; // up->right
        change[{0,1}]={1,0}; // right->down
        change[{1,0}]={0,-1}; // down->left
        change[{0,-1}]={-1,0}; // left->up
        int x=0;
        int y=0;
        pair<int,int> dir={0,1};
        while(x>=0 && y>=0 && x<matrix.size() && y<matrix[0].size()){
            if(matrix[x][y]==1){
                dir=change[dir];
            }
            matrix[x][y]=0;
            res={x,y};
            x+=dir.first;
            y+=dir.second;
        }
        return res;
    }

};
