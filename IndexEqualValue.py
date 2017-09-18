l=input().split();
for i in range(0,len(l)):
    if int(l[i])==i:
        print(i);
    elif int(l[i])>len(l):
        break;
