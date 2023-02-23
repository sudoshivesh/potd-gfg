//User function Template for C++

class Solution{   
public:
    int minIteration(int N, int M, int x, int y){    
        // code here
        vector<vector<int>> grid(N, vector<int>(M, 0));
        grid[x-1][y-1] = 1;
        queue<pair<int,int>> q;
        q.push({x-1,y-1});
        int dr[] = {-1, 0, 1, 0};
        int dc[] = {0, 1, 0, -1};
        int moves = -1;
        
        while(!q.empty()){
            int sz = q.size();
            while(sz--){
                auto it = q.front();
                q.pop();
                int r = it.first, c = it.second;
                
                for(int i = 0; i < 4; i++){
                    int nr = r + dr[i];
                    int nc = c + dc[i];
                    if(nr >= 0 && nr < N && nc >= 0 && nc < M && grid[nr][nc] == 0){
                        grid[nr][nc] = 1;
                        q.push({nr, nc});
                    }
                }
            }
            moves++;
        }
        return moves;
    }
};
