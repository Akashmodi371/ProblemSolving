#include <bits/stdc++.h>
using namespace std;
#define int long long
int a[2000];
int tree[8000];
void build(int node, int start, int end) 
{ 
    // If there is only one element in current subarray 
    if (start==end) 
    { 
        tree[node] = arr[start]; 
        return; 
    } 
  
    int mid = (start+end)/2; 
  
    // build left and right segments 
    build(2*node, start, mid); 
    build(2*node+1, mid+1, end); 
  
    // build the parent 
    int left_lcm = tree[2*node]; 
    int right_lcm = tree[2*node+1]; 
  
    tree[node] = lcm(left_lcm, right_lcm); 
} 
int query(int node, int start, int end, int l, int r) 
{ 
    // Completely outside the segment, returning 
    // 1 will not affect the lcm; 
    if (end<l || start>r) 
        return 1; 
  
    // completely inside the segment 
    if (l<=start && r>=end) 
        return tree[node]; 
  
    // partially inside 
    int mid = (start+end)/2; 
    int left_lcm = query(2*node, start, mid, l, r); 
    int right_lcm = query(2*node+1, mid+1, end, l, r); 
    return lcm(left_lcm, right_lcm); 
} 
  
int gcd(int a, int b)
{
if(b == 0) {
return a;
}
else {
return gcd(b, a % b);
}
}
int lcm(int a, int b) {
    return a * b / gcd(a, b);
}
 
signed main(){
    ios_base::sync_with_stdio(false);
    //------------//
    cin.tie(NULL);// Don't use if the question is interactive;
    //------------//
    int t;
    cin>>t;
    while(t--){
 int n;
cin>>n;
int a[n];
 map<int,int>m;
for(int i=0;i<n;i++)
{
cin>>a[i];
m[a[i]]++;
}
build(1, 0, n-1); 

int dp[n][n];
for(int i=n-1;i>=0;i--)
{
for(int j=i;j<n;j++)
{
if(i==j)
dp[i][j]=0;
else
{
dp[i][j]=dp[i][j-1];
int x;
x=query(1,0,n-1,i,j);
if(m[x]>0)
dp[i][j]=dp[i][j-1]+1;
}
}
}


       cout<<dp[0][n-1]<<endl; 
    }
    return 0;
}