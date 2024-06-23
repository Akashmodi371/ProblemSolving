#include <bits/stdc++.h>

using namespace std;

#define int long long

using vi = vector < int > ;

const int M = 1e6 + 2;

vector < int > p;
vector < int > sppf(M, 0);

void calcSPF() {
  sppf[1] = 1;
  for (int i = 2; i < M; i++) {
    if (sppf[i] == 0) {
      sppf[i] = i;
      for (int j = i * i; j < M; j += i)
        if (sppf[j] == 0)
          sppf[j] = i;
    }
  }
}

void code() {
  int k;
  cin >> k;
  int res = 0;
  if (sppf[k] == k)
    for (int i = 0; i < p.size() && p[i] <= k; i++)
      res += p[i] * k;
  else
    for (int i = 0; i < p.size() && p[i] <= sppf[k]; i++)
      res += p[i] * k;
  cout << res << '\n';
}

signed main() {
  calcSPF();
  for (int i = 2; i < M; i++)
    if (sppf[i] == i)
      p.push_back(i);

  int t;
  cin >> t;
  while (t--)
    code();
  return 0;
}