# include <stdio.h>

void copyarr(int a[], int b[], int n)
{
    for(int i = 0; i < n; i++)
        {
            a[i] = b[i];
        }
}
void sortik (int a[], int n)
{
    int minn = 0;
    int iminn = 0;
    int r[n];
    for(int i = 0; i < n - 1; i++)
    {
        minn = a[i];
        iminn = i;
        for(int j = 0; j < n - 1; j++)
        {
            if (minn > a[j])
            {
                minn = a[j];
                iminn = j;
            }

        }
    }
        for(int j = 0; j < n - 1; j++)
        {
            if (minn > a[j])
            {
                minn = a[j];
                iminn = j;
            }

        }

    copyarr(r, a, n);
    for(int i = 1; i < n; i++)
    {
        int t = a[i];
        int k = 0;
        while (a[i] > a[k])
        {
            k++;
        }
        r[k] += -r[k] + a[i];
        int l = k;
        while (l < i)
        {
            r[l + 1] = a[l];
            l++;
        }
        copyarr(a, r, n);

    }
}
int main()
{
    int n = 0;
    scanf("%d", &n);
    int a[n];
    for(int i = 0; i < n; i++)
    {
        scanf("%d", &a[i]);
    }
    sortik (a, n);
    printf("%d ", a[(n - 1)/2]);




    return 0;
}
